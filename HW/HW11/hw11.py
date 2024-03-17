from typing import List

class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        if (image[sr][sc] == color): 
            return image
        
        self.fill(image, sr, sc, image[sr][sc], color)

        return image
    
    def fill(self, image: List[List[int]], sr: int, sc: int, currColor:int, newColor: int):
        row = len(image)
        col = len(image[0])

        if (sr < 0 or sc < 0 or sr >= row or sc >= col or image[sr][sc] != currColor): 
            return
        
        image[sr][sc] = newColor

        self.fill(image, sr + 1, sc, currColor, newColor)
        self.fill(image, sr - 1, sc, currColor, newColor)
        self.fill(image, sr, sc + 1, currColor, newColor)
        self.fill(image, sr, sc - 1, currColor, newColor)
