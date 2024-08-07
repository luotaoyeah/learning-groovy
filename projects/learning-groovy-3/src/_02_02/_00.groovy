package _02_02

// 2.2 compact syntax

["Rod", "Carlos", "Chris"]
        .findAll { it.size() < 4 }
        .each { println it }
