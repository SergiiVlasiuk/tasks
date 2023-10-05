# Matrix rotation 90 degrees clockwise

## Task
Please implement a function called matrix rotation. the function receives a matrix of integers as input, rotates it 90 degrees clockwise, and returns the rotated matrix as output.

## Solution idea description
For each element at position `(i, j)` in the original matrix, should be moved at position (j, rows - 1 - i) in the rotated matrix.

Where
- `i` is the current row index
- `j` - column index
- `rows` - total number of rows in the income matrix

Implementation is provided in a `Matrix90degreesClockwiseRotationServiceImpl` class.

# How to check
`gradle test`

builds correctly, but corrupting any case will break the build
