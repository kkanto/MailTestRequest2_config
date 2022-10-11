 
listView('MailTestRequest2 Jobs') {
    description('MailTestRequest2 Jobs')
    jobs {
        regex('MailTestRequest2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
