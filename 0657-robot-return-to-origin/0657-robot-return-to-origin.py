class Solution:
    def judgeCircle(self, moves: str) -> bool:
        x=0
        y=0
        for m in moves:
            if(m=='R'):
                x = x+1
            if(m=='L'):
                x = x-1
            if(m=='U'):
                y = y+1
            if(m=='D'):
                y = y-1
        return x==0 and y==0