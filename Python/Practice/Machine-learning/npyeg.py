#Creating Numpy Array

import numpy as np

def test_run():
    #list 1D array
    print (np.array([2,3,4]))
    #list of tuples to 2D array
    print (np.array([(2,3,4),(5,6,7)]))
    #empty array
    print (np.empty(5))
    print (np.empty((5,4)))
    #identity matrix//null matrix
    print (np.ones((5,4)))
    #Specifying the datatype
    print (np.ones((5,4), dtype = np.int_))
    #Generating random numbes ,uniformly sampled fron 0-1
    print (np.random.random((5,4))) # for a tuple
    print (np.random.rand(5,4)) # not tuple
    #Sample numbers from a gaussian normal distribution mean = 0  s.d = 1
    print (np.random.normal(size=(2,3)))
    #Sample numbers from a gaussian normal distribution mean = 0  s.d = 1
    print (np.random.normal(50, 10, size=(2,3)))

if __name__=="__main__":
    test_run()
