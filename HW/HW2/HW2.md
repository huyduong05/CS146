I used the same approaches in both Java and Python.

Using the logic that once a prior version is bad, then the following versions will also be bad. 
We can modify a binary search to find the where the first bad version and last good version meet, allowing us to find the first bad version.
Essentially if int mid us a bad version, then the first bad version wont be after mid. 
That allows us to set high = mid for the next iteration of the loop. 
And vice versa with low = mid + 1 if firstBadVersion(mid) == false. 
The while loop will iterate till low is the first bad version and high is the last good version. 
The program returns low.