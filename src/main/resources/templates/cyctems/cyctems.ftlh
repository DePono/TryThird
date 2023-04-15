<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список систем</h4>
<#list cyctems as cyctem>
    <div>
        <p><b>${cyctem.title}</b> <a href="/cyctem/${cyctem.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Систем нет</h3>
</#list>
</body>
</html>