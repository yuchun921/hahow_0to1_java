# Keyword: Package and Import

## Package
- use to manage "class", just like folder.
- add sub-package by "."
- corresponding file directory  
	```text  
	----- src  
	  |-- codegym  	 
	  |     |--TestDemo  
	  |  
	```
## Import
- let complie knows in which package the class is loacted
- new 一個新物件時 (以Integer舉例)
	- 正確應該是需要: `java.lang.Integer i = new java.lang.Integer("1");`
	- 但由於Java自動`import java.lang.*;` ==> 表示將java.lang下所有功能都import進來
	- 因此new時不需要輸入 `java.lang.######`
	
- [note] import 時盡量不要用 `*` 全部import, 應將完整的`package and class`詳細寫清
	可以避免有第三方套件或自己寫的 class有名稱重複產生衝突的情況