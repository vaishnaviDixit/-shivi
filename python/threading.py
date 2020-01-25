#THREADS
'''
from threading import Thread
import time

exitFlag=0
class myThread(Thread):
     def __init__(self,threadID,name,counter):
         Thread.__init__(self)
         self.threadID=threadID
         self.name=name
         self.counter=counter
     def run(self):
         print("starting"+self.name)
         print_time(self.name,5,self.counter)
         print("Exiting"+self.name)
def print_time(threadName,counter,delay):
    while counter:
        if exitFlag:
            threadName.exit()
        time.sleep(delay)
        print("%s:%s"%(threadName,time.ctime(time.time())))
        counter-=1
#create new threads
thread1=myThread(1,"Thread-1",1)
thread2=myThread(2,"Thread-2",2)
#start new thread
thread1.start()
thread2.start()
'''


import threading
import time

class myThread(threading.Thread):
    def __init__(self,threadID,name,counter):
        threading.Thread.__init__(self)
        self.threadID=threadID
        self.name=name
        self.counter=counter
    def run(self):
        print("starting"+self.name)
        # get lock to sync threads
        threadLock.acquire()
        print_time(self.name,self.counter,3)
        #free lock to release next thread
        threadLock.release()
def print_time(threadName,delay,counter):
    while counter:
        time.sleep(delay)
        print("%s:%s"%(threadName,time.ctime(time.time())))
        counter-=1
threadLock=threading.Lock()
threads=[]
#create new threads
thread1=myThread(1,"Thread-1",1)
thread2=myThread(2,"Thread-2",2)
#start new thread
thread1.start()
thread2.start()
#add thread to thread list
threads.append(thread1)
threads.append(thread2)
#wait for all threads to complete
for t in threads:
    t.join()
print("exiting main thread")    
        
        
        
