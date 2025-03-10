# from collections import deque, defaultdict

# def find_shortest_path(graph, source, destination):
#     queue = deque([(source, [source])])
#     visited = set()
    
#     while queue:
#         current, path = queue.popleft()
        
#         if current == destination:
#             return path
        
#         visited.add(current)
        
#         for neighbor in graph[current]:
#             if neighbor not in visited:
#                 queue.append((neighbor, path + [neighbor]))
    
#     return None

# N = int(input().strip())

# graph = defaultdict(list)

# for _ in range(N):
#     line = input().split()
#     junction = line[0]
#     connections = line[1:]
#     graph[junction].extend(connections)

# ball_colors = input().strip().split()
# buckets = {}
# source = None

# for junction, neighbors in graph.items():
#     if 'source' in junction:
#         source = junction
#     else:
#         for neighbor in neighbors:
#             if 'bucket' in neighbor:
#                 color = neighbor.split('bucket')[0]  
#                 buckets[color] = neighbor

# total_openings = 0
# last_open_path = defaultdict(lambda: None)  

# for color in ball_colors:
#     if color not in buckets:
#         continue 
    
#     bucket = buckets[color]
    
#     path = find_shortest_path(graph, source, bucket)
    
#     for i in range(len(path) - 1):
#         current_junction = path[i]
#         next_junction = path[i + 1]
        
#         if last_open_path[current_junction] != next_junction:
#             total_openings += 1
#             last_open_path[current_junction] = next_junction

# print(total_openings)


def count_junction_openings(graph, ball_sequence):
    current_paths = {}  
    openings = 0  
    
    for ball in ball_sequence:
        current_junction = "source"
        target_bucket = ball  
        
        while current_junction != target_bucket:
            for neighbor in graph[current_junction]:
                if neighbor == target_bucket or target_bucket in graph.get(neighbor, []):
                    if current_junction not in current_paths or current_paths[current_junction] != neighbor:
                        current_paths[current_junction] = neighbor
                        openings += 1 
                    current_junction = neighbor
                    break

    return openings

N = int(input())  
graph = {}

for _ in range(N):
    line = input().split()
    junction = line[0]
    connections = line[1:]
    graph[junction] = connections

ball_sequence = input().split()

junction_openings = count_junction_openings(graph, ball_sequence)
print(junction_openings)
