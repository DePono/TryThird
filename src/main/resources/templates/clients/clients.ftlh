<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список клиентов</h4>
<table border="1">
    <tr>
        <th scope="col">Телефон</th>
        <th scope="col">Имя</th>
        <th scope="col">Фамилия</th>
        <th scope="col">email:</th>
        <th scope="col">Удаление:</th>
    </tr>
<#list clients as client>
    <tr>
        <th>${client.phone}</th>
        <th>${client.name}</th>
        <th>${client.surname}</th>
        <th>${client.email}</th>
        <th><form action="/client/delete/${client.phone}" method="post">
            <input type="submit" value="Удалить клиента"/>
        </form>
        </th>
<#else>
    <h3>Клиентов нет</h3>
</#list>
</body>
</html>