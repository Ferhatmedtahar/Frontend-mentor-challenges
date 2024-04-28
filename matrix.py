import numpy as np

# Define the matrix M
M = np.array([
    [0, 1, 1, 0],
    [0, 0, 1, 0],
    [1, 0, 0, 1],
    [1, 1, 0, 1]
])

# Function to calculate the power of a matrix
def matrix_power(matrix, n):
    return np.linalg.matrix_power(matrix, n)

# Replace 'n' with the actual integer value for which you want to calculate the power
n = # Your value here

# Calculate M to the power of n
result = matrix_power(M, n)

# Print the result
print(f"M to the power of {n} is:\n{result}")