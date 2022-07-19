# 例外處理 Exception
- 例外處理機制是協助開發人員避免可能的錯誤發生
- Exception 代表的是一個"Java錯誤的物件"
- Checked Exception: 編譯時期發生
- Unchecked Exception: 執行期間發生
	- ex: NullPointerException
	
![JavaTrowable](https://i.imgur.com/i9f1Z47.png)

## Try-catch
- catch 捕捉例外發生處理
- finally 是最後執行區塊, 大多用於關閉資源

## throw-throws
- 主動拋出exception
- 將exception向外拋出, 讓呼叫它的物件處理

## NullPointerException
- 開發java程式會盡量避免此錯誤
