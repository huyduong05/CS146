Same method used for Java and Python

Logic: 

Minimum number of servers required to run all jobs = max amount of servers being used at the same time.

If the start times and end times are sorted in order, 
we are able to interate through the two 
and see how many jobs are taking place a once. 

- let start = [0, 5, 15] and end = [10, 20, 30]
- we start at time 0 and since the first end time (10) is greater than 0, there is currently 1 job taking place
- next we check the next starting time of 5 and since 5 < 10, there is now 2 jobs happening at once
- if a start > end, that means a job has ended and we decrement how many jobs are happening


Implementation: 

- create sorted arrays for start and end times
- create variables to count the amount of current jobs taking place (count) and the max amount of servers being used at once (result/max)
- using two pointers and a for loop
    - have one pointer iterate through the start array
    - have another pointer iterate through the end array
    - while loop executes at end of the start array bc no other jobs will start
    - check if another job has started before a current job has ended
        - increment and decrement count accordingly 
- return the max amount of servers being used at the same time
