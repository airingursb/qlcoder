//
//  task-75f9.swift
//  
//
//  Created by Airing on 16/4/23.
//
//  task-75f9

import Darwin

var num1: Double = 0
var k: Double = 1
var gao: Double = 987654321

while num1 < gao {
    
    k++
    num1 = pow(2, k)
}

var answer: Double = (gao - pow(2, k - 1)) * 2

print(answer)
