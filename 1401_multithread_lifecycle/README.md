# Multithread: Lifecycle

## �h�����
- ������O�@�~�t�Τ��t�B�z���ɶ����򥻳�� => �P�@�Ӯɶ��i�H���h��Ʊ�
	- EX: �{�bcpu�����֤ߡB�|�֤�, �i�H�P�ɰ��h��Ʊ�

![thread lifecycle](http://mahaljsp.asuscomm.com/wp-content/uploads/2016/10/java_thread_lifecycle.png)

1. new Thread
2. start()                   - �ǳư���o�� thread  
3. �i�h Runnable �ƶ�          - �b�ustart()�ǳư���v���٨S���u���}�l����A�u�i�h Runnable �ƶ��v  
4. ���� thread scheduler �s��  - �i�h�ƶ�����A����thread scheduler�ƯZ���I�s  
	-- �p�G�Q block (��time.sleep) �N�n����Q block ������A���s�^�� Runnable �ƶ�  
5. run()                      - �N�O�� Running �ϡA�u���b����  
6. Thread dead				 - ���槹��Athread����  


[Oracle Doc]https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Thread.html  
[Life cycle of a Thread]https://www.javatpoint.com/life-cycle-of-a-thread  
[�������¦]http://mahaljsp.asuscomm.com/index.php/2018/12/01/java8_thread_basic/  
[��������ͩR�g���ΰ���������k�Ը�]https://iter01.com/506682.html  

### ����Thread
- extends class Thread
	- java�u���~�Ӥ@�Ӫ���, �ҥH�~��thread��N�����~�Ө�L����
	- �n�мgrun(), �N��@��m�䤤
	- thread.start()
- implements interface Runnable
	- �i�H�~�Ө�L����B���@��L����
	- �N�����JThread constructor
	- thread.start()