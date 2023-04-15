<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Подробная информация о комании</h4>
<b>Название компании: </b>${company.title}<br>
<b>Описание компании: </b>${company.description}<br>
<b>Город: </b>${company.city}<br>
<b>Почта: </b>${company.email}<br>
<b>Телефон: </b>${company.phone}<br>
<hr>
<#list clients as client>
    <div>
        <p><b>${client.username}</b> <a href="/client/${client.phone}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Клиентов нет</h3>
</#list>
<form action="/company/delete/${company.phone}" method="post">
    <input type="submit" value="Удалить компанию"/>
</form>
<h3>Добавить нового клиента</h3>
<form action="/client/create" method="post">
    Телефон: <label>
        <input type="text" name="phone"/>
    </label><br><br>
    Компания: <label>
        <input type="text" name="id_company"/>
    </label><br><br>
    Username: <label>
        <input type="text" name="city"/>
    </label><br><br>
    Имя: <label>
        <input type="text" name="name"/>
    </label><br><br>
    Фамилия: <label>
        <input type="text" name="surname"/>
    </label><br><br>
    Почта: <label>
        <input type="text" name="email"/>
    </label><br><br>
    <input type="submit" value="Добавить клиента" />
</form>
</body>
</html>