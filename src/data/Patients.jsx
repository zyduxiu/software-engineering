export let patients = [
    {
        key: '1',
        name: '小张',
        gender: '男',
        age: 28,
        doctor: '李医生',
        amount: '¥200.00',
        date: '2024-03-20',
        status: '待收',
        isMember: true,
        phoneNumber:'18777618903',
        cardType: '金卡',
        cardNumber: '1234567890',
        cardValue:7500.00,
        cardDiscount: '9折',
        chargeItems: [
            { key: '1', serviceName: '全身检查', price: '¥50.00', amount: '¥0.00', discount: '赠送' },
            { key: '2', serviceName: '定制方案A', price: '¥300.00', amount: '¥270.00', discount: '9折' },
        ],
    },
    {
        key: '10',
        name: '小李',
        gender: '男',
        age: 32,
        doctor: '张医生',
        amount: '¥200.00',
        date: '2024-03-17',
        status: '已收',
        isMember: false,
        chargeItems: [
            { key: '1', serviceName: '全身检查', price: '¥50.00', amount: '¥50.00', discount: '无' },
        ],
    },
    {
        key: '2',
        name: '小王',
        gender: '女',
        age: 34,
        doctor: '王医生',
        amount: '¥500.00',
        date: '2024-03-20',
        status: '待收',
        isMember: true,
        phoneNumber:'15466980731',
        cardType: '银卡',
        cardNumber: '2345678901',
        cardValue: 5500.00,
        cardDiscount: '8折',
        chargeItems: [
            { key: '1', serviceName: '血液检测', price: '¥100.00', amount: '¥0.00', discount: '赠送' },
            { key: '2', serviceName: '定制方案B', price: '¥400.00', amount: '¥320.00', discount: '8折' },
        ],
    },
    {
        key: '3',
        name: '小梅',
        gender: '女',
        age: 29,
        doctor: '陈医生',
        amount: '¥450.00',
        date: '2024-03-18',
        status: '已收',
        isMember: false,
        phoneNumber:'15466980731',
        chargeItems: [
            { key: '1', serviceName: '心电图', price: '¥150.00', amount: '¥150.00', discount: '无' },
            { key: '2', serviceName: 'B超', price: '¥200.00', amount: '¥200.00', discount: '无' },
        ],
    },
    {
        key: '4',
        name: '小刘',
        gender: '男',
        age: 46,
        doctor: '黄医生',
        amount: '¥800.00',
        date: '2024-03-19',
        status: '已收',
        isMember: true,
        cardType: '钻石卡',
        cardNumber: '3456789012',
        cardValue: 9500.00,
        cardDiscount: '7折',
        chargeItems: [
            { key: '1', serviceName: 'MRI', price: '¥600.00', amount: '¥420.00', discount: '7折' },
            { key: '2', serviceName: '药物静脉注射', price: '¥200.00', amount: '¥200.00', discount: '无' },
        ],
    },
    {
        key: '5',
        name: '小赵',
        gender: '男',
        age: 38,
        doctor: '刘医生',
        amount: '¥350.00',
        date: '2024-03-21',
        status: '已收',
        isMember: false,
        chargeItems: [
            { key: '1', serviceName: 'CT扫描', price: '¥300.00', amount: '¥300.00', discount: '无' },
            { key: '2', serviceName: '血压测量', price: '¥50.00', amount: '¥50.00', discount: '无' },
        ],
    }
    // ... 其他患者信息
];