<#import "common.ftl" as c>

<@c.page>
<form method="POST" action="/add_record" class="ui-form">
    <div class="form-row">
        <input type="text" name="firstName" placeholder="Фамилия"/>
    </div>
    <div class="form-row">
    <input type="text" name="secondName" placeholder="Имя"/>
    </div>
    <div class="form-row">
    <input type="text" name="patronymic" placeholder="Отчество"/>
    </div>
    <div class="form-row">
    <input type="text" name="subject" placeholder="Предмет"/>
    </div>
    <div class="form-row">
    <input type="text" name="squad" placeholder="Группа"/>
    </div>
    <div class="form-row">
    <input type="text" name="time" placeholder="Дата и время"/>
    </div>
    <p><input type="submit" value="Сохранить"></p>
</form>
</@c.page>
