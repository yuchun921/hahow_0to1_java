# 垃圾回收機制 Garbage Collection
- `System.gc();`: 釋放物件所佔據的記憶體空間
- 將參考物件上的名稱指定為null => 代表這個物件不再被使用
- 使用Thread.sleep()持續觀察結果
- 可以不用特別做GC, 因JVM會清理掉不用的垃圾, 釋放記憶體