 
listView('branch_protection_super_hiper Jobs') {
    description('branch_protection_super_hiper Jobs')
    jobs {
        regex('branch_protection_super_hiper_.+')
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
