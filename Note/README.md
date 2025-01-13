# Java_practice
## 前置作業
1. 要記得安裝JDK
    - [網頁在這裡](https://www.oracle.com/java/technologies/downloads/#jdk23-windows) => 下載MSI那個
    
2. 設置環境變數
    - 將安裝的Java資料夾位置存下來放進環境變數那裡

## Example
1. 建立資料夾時**要用小寫**，要不然在package那邊會有問題
2. 編譯時要使用
```
javac your_file_name.java #編譯檔案
java you_class_name # 執行檔案
```
3. 變換形式之指定目錄
```
javac -d output_file your_file_name.java
```
4. package的部分大概是如下示範
當程式碼如下時
```
package practice;
....
....
...
...
```
- 代表今天javac編譯後會被放進practice的資料包中</br>
- 執行時，必須用以下方式執行class
```
PS D:\北科大-專題\Java_practice\Ian> javac practice_001/J_001.java
PS D:\北科大-專題\Java_practice\Ian> java practice_001.J_001
x = 10
y = 1000000000000000000
x = 11
b = true
```

