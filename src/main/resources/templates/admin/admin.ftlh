<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1>
<hr>
<h4>Информация о клиентах</h4>
<table border="1">
    <tr>
        <th scope="col">Компания</th>
        <th scope="col">Ник</th>
        <th scope="col">Имя</th>
        <th scope="col">Фамилия</th>
        <th scope="col">Почта</th>
        <th scope="col">Номер телефона</th>
        <th scope="col">Редактирование</th>
        <th scope="col">Подробная информация</th>
    </tr>
    <#list clients as client>
        <tr>
            <th>${client.id}</th>
            <th>${client.firstName}</th>
            <th>${client.email}</th>
            <th>${client.phoneNumber}</th>
            <th>${client.phoneNumber}</th>
            <th>${client.phoneNumber}</th>
            <th><a href="/admin/stewart/edit/${client.id}">Редактирование</a></th>
            <th><a href="/admin/stewart/edit/${client.id}">Подробная информация</a></th>
        </tr>
    <#else>
        <h3>Клиентов нет</h3>
    </#list>
</table>
</body>
</html>