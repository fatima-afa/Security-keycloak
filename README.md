--------
![img.png](img.png)</br>
![img_2.png](img_2.png)</br>
![img_3.png](img_3.png)</br>
![img_4.png](img_4.png)</br>
![img_6.png](img_6.png)</br>
![img_5.png](img_5.png)</br>
![img_7.png](img_7.png)</br>
![img_8.png](img_8.png)</br>
![img_9.png](img_9.png)</br>
<h2>On va creer le client pour notre application angular</h2></br>
![img_10.png](img_10.png)</br>
![img_11.png](img_11.png)</br>
![img_12.png](img_12.png)</br>
![img_13.png](img_13.png)</br>
<p>pour test votre client : </p></br>
<p>
POST http://localhost:9090/auth/realms/glsid-realm/protocol/openid-connect/token
Accept: application/json
Content-Type: application/x-www-form-urlencoded

grant_type=password&username=user1&password=1234&client_id=glsid-angular-client
</p></br>
![img_14.png](img_14.png)</br>
<p>apres que vous securise /products avec les guarde, et vous authentifier vous allez avoir la liste des produits</p>
![img_15.png](img_15.png)</br>
![img_16.png](img_16.png)</br>
