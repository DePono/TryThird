<!DOCTYPE html>
<html lang="en">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список компаний</h4>
<#list companies as company>
    <div>
        <p><b>${company.title}</b> <a href="/company/${company.phone}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Компаний нет</h3>
</#list>
<hr>
<h3>Создать новую компанию</h3>
<form action="/company/create" method="post">
    Название компании: <label>
        <input type="text" name="title"/>
    </label><br><br>
    Описание компании: <label>
        <input type="text" name="description"/>
    </label><br><br>
    Город: <label>
        <input type="text" name="city"/>
    </label><br><br>
    Почта: <label>
        <input type="text" name="email"/>
    </label><br><br>
    Номер телефона: <label>
        <input type="text" name="phone"/>
    </label><br><br>
    Аккаунт:
    <label for="acc"></label><select name="accountsByTypeAccount" id="acc">
            <option value="select">Выберете тип аккаунта</option>
            <option value="BASIC">Базовый</option>
            <option value="PROFESSIONAL">Профессиональный</option>
            <option value="PREMIUM">Премиум</option>
        </select>
        <input type="submit" value="Добавить компанию" />
</form>
</body>
</html>