import matplotlib.pyplot as plt
import networkx as nx
from collections import defaultdict

def visualize_graph(graph):
    # Create a directed graph using NetworkX
    G = nx.DiGraph()
    
    # Add edges from the graph
    for junction, connections in graph.items():
        for neighbor in connections:
            G.add_edge(junction, neighbor)
    
    # Draw the graph
    pos = nx.spring_layout(G)  # Positions the nodes in a visually pleasing way
    plt.figure(figsize=(10, 8))
    
    # Draw the graph with node labels
    nx.draw(G, pos, with_labels=True, node_color='lightblue', node_size=2000, font_size=12, font_weight='bold', arrows=True)
    
    # Draw the labels on the edges to show direction
    edge_labels = { (u, v): f'{u}->{v}' for u, v in G.edges()}
    nx.draw_networkx_edge_labels(G, pos, edge_labels=edge_labels, font_size=10)
    
    plt.title('Visualized Junction Graph for Routing the Balls', size=15)
    plt.show()

def main():
    # Reading the number of routes
    N = int(input().strip())
    
    # Graph to store the junctions and their connections
    graph = defaultdict(list)
    
    # Reading the routes and building the graph
    for _ in range(N):
        line = input().split()
        junction = line[0]
        connections = line[1:]
        graph[junction].extend(connections)
    
    # Visualize the graph
    visualize_graph(graph)

# Call the main function
if __name__ == "__main__":
    main()
