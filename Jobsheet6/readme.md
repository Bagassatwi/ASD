# Jobsheet 6 ASD
## 6.2.5 Experiment 1 - Implementing Sorting Using Objects; Questions
### 1. Explain the function of the following program code:
![alt text](image.png) <br/>
First, it checks if data[j] is bigger than data[j+1], if it does, it then stores the data of data[j] to a temporary variable, then the value of data[j] is rep;aced with the value of data[j+1], then the value of data[j+1] is replaced with the value in the temporary variable

### 2. Show the program code that implements the minimum value search algorithm in selection sort!
```java
for (int j = i + 1; j < size; j++) {
  if (data[j] < data[minIndex]) {
    minIndex = j;
  }
}
```

### 3. In insertion sort, explain the purpose of the condition in the loop. 
![alt text](image-2.png)<br/>
It first checks if j is more or equal to 0, then it checks if the value in data[j] is bigger than the key

### 4.  In insertion sort, what is the purpose of the given command?
![alt text](image-1.png)<br/>
it replaces the value in data[j+1] with data [j]

## 