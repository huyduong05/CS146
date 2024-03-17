Both Java and Python use the same approach.

Intuition: Use depth first search to execute flood fill and use a helper method to recursively fill the neighbors of each pixel. 

Procedure: 
1. Check if starting pixel is already the color we want to change it to, the just return the image as is.
2. call the recursive helper function to floodfill the neighboring pixels.
3. Return the new editted image. 

Recursive helper method: 
- first check if this is a valid pixel to change its color
- change the color of that pixel
- recursively call the method for its neighbor pixels (up, down, left, right)