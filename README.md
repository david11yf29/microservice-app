![microservice-app](https://socialify.git.ci/david11yf29/microservice-app/image?forks=1&issues=1&language=1&name=1&owner=1&pulls=1&stargazers=1&theme=Light)

# microservice-app
一個使用 Spring Boot 框架的下單 App，用於下單和發送通知。

Discovery Server(:8761) - Eureka Server
Production Service(:8080), Inventory Service(:8082)
Order Service(:8081) - Kafka
ApiGateway(:8083)
Notification Service(:8084) - Kafka
Prometheus(:9090) + Grafana(:3000) - Monitor Health
Key-cloak(:8181) - Token Authentication

## 目錄
- [功能](#功能)
- [使用方法](#使用方法)
- [技術細節](#技術細節)
- [示例](#示例)
- [授權](#授權)

## 功能
- 提供 RESTful API (Postman)
- 使用 Kafka 推送下單成功訊息
- 使用 Grafana 視圖化流量情況

## 使用方法
使用 Postman 測試系統：
 - 加入新產品至資料庫：`POST http://localhost:8083/api/product`
 - 查詢產品清單：`GET http://localhost:8083/api/product`
 - 提交訂單：`POST http://localhost:8083/api/order`
 - 確認 App 各微服務狀態：`http://localhost:8761`
 - 使用 Grafana 進行數據提取和數據可視化：`http://localhost:3000`
  
## 技術細節
- **後端**：Spring Boot, MyBatis, Websocket
- **資料庫**：MySQL, Redis
- **前端**：Nginx

## 示例
https://github.com/user-attachments/assets/1449a1c6-5248-415e-8d56-86540886a1d8

<img width="420" alt="截圖 2024-12-05 下午2 00 58" src="https://github.com/user-attachments/assets/07229cef-b335-4a51-af47-a70fdcd465bb">
<img width="420" alt="截圖 2024-12-05 下午2 01 12" src="https://github.com/user-attachments/assets/1281b73b-91d7-46eb-8b03-3e9b7edc6741">
<img width="420" alt="截圖 2024-12-05 下午2 01 17" src="https://github.com/user-attachments/assets/13532d31-2d4f-4975-98f7-a8227655da33">
<img width="420" alt="截圖 2024-12-05 下午2 00 43" src="https://github.com/user-attachments/assets/253e0a0e-03b5-4cf3-8020-8be7bb27df03">

## 授權
本項目基於 [MIT License](LICENSE) 許可使用。




