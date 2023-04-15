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
<h4>Подробная информация о клинете</h4>
<b>Username: </b>${client.username}<br>
<b>Имя: </b>${client.name}<br>
<b>Фамилия: </b>${client.surname}<br>
<b>Почта: </b>${client.email}<br>
<b>Телефон: </b>${client.phone}<br>
<hr>
<form action="/client/delete/${client.phone}" method="post">
    <input type="submit" value="Удалить клиента"/>
</form>
</body>
</html>