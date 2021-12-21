<#import "common.ftl" as c>

<@c.page>
    <div>
        <table class="table_dark">
            <tr>
                <th>№</th>
                <th>ФИО Преподавателя</th>
                <th>Предмет</th>
                <th>Группа</th>
                <th>Время</th>
            </tr>
            <#list records as record>
                <tr><td>${record.id}</td><td>${record.firstName} ${record.secondName} ${record.patronymic}</td><td>${record.subject}</td><td>${record.squad}</td><td>${record.time}</td></tr>
            <#else>
                <tr><td>Список пуст</td></tr>
            </#list>
        </table>
    </div>
</@c.page>
