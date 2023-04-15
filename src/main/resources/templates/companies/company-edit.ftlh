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
<h3>Редактировать данные</h3>
<form action="/company/${company.phone}/edit" method="post">
    Название: <label>
        <input type="text" name="title"/>
    </label><br><br>
    Описание: <label>
        <input type="text" name="description"/>
    </label><br><br>
    Город: <label>
        <input type="text" name="city"/>
    </label><br><br>
    Почта: <label>
        <input type="text" name="email"/>
    </label><br><br>
    <input type="submit" value="Обновить данные" />
</form>
</body>
</html>