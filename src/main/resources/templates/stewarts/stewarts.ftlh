<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Управление платформами</h4>
<table border="1">
    <tr>
        <th scope="col">Название</th>
        <th scope="col">Описание</th>
        <th scope="col">Адрес IP</th>
        <th scope="col">Порт:</th>
        <th scope="col">Управление:</th>
    </tr>
    <#list stewarts as stewart>
        <tr>
        <th>${stewart.title}</th>
        <th>${stewart.description}</th>
        <th>${stewart.ipAddress}</th>
        <th>${stewart.port}</th>
        <th> <form action="/stewarts/delete/${stewart.port}" method="post">
                <input type="submit" value="Удалить платформу"/>
            </form></th>
        </tr>
<#else>
    <h3>Платформ нет</h3>
</#list>

</body>
</html>