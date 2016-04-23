//
//  task-751e.swift
//  
//
//  Created by Airing on 16/4/23.
//
//
//  task-751e

import Foundation

var i = 0
var j = 0

while i < 2333 {
    
    j++
    
    if j % 2 == 0 || j % 3 == 0 {
        i++
    }
}

print(j)