from google import genai
from dotenv import load_dotenv
import os
import argparse

content = ""

parser = argparse.ArgumentParser(description='Analyze a C++ source file.')
parser.add_argument('filename', type=str, help='The path to the C++ source file to analyze.')
args = parser.parse_args()

if not os.path.isfile(args.filename):
    print(f"Error: The file '{args.filename}' does not exist or is not a file.")
    exit(1)

with open(args.filename, 'r') as f:
    content = f.read()


load_dotenv()

client = genai.Client(api_key=os.getenv('gemini_api_key'))


response = client.models.generate_content(
    model="gemini-2.0-flash", contents=['''
                                        analyse this file, check for 3 things : 
                                        1. look at the defination and check is code is correct to it or not. if not tell the approch but dont give code
                                        2. check for comments if a comment tell to solve a thing or if you find error the solve it
                                        3. check if code is optimised or not. if it isnt then provide approch to get optimised solution
                                         
                                        if asked to provide code solution in comments like:
                                        1. CODE: solve -> then give entire code solution
                                        2. CODE: solve <function_name> -> then give code for only that function
                                        
                                        make sure to give a proper solution as the solution would be printed on terminal so no markdown or bold will happen so write accordingly.
                                        also make sure to provide code in c++
                                        ''', content]
)

with open('analyse.txt', 'w') as f:
    f.write(response.text)