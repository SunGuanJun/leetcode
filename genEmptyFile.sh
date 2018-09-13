#!/bin/bash

# 生成类
cd src/main/java
for ((i=1;i<=1000;i+=50)); do
	end=`expr $i + 49`
	startStr=`printf "%04d\n" $i`
	endStr=`printf "%04d\n" $end`
	mkdir 'leetcode_'$startStr'_'$endStr
	cd 'leetcode_'$startStr'_'$endStr

	for ((j=$i;j<=$end;j++)); do
		jStr=`printf "%04d\n" $j`
		mkdir 'leetcode_'$jStr
		cd 'leetcode_'$jStr

		touch 题目.md
		printf 'package leetcode_'$startStr'_'$endStr'.leetcode_'$jStr';\n\n' > Solution$jStr.java
		printf 'public class Solution'$jStr' {\n\n}' >> Solution$jStr.java
		cd ..
	done
	cd ..
done

# 生成test类
cd ../../..
cd src/test/java
for ((i=1;i<=1000;i+=50)); do
    end=`expr $i + 49`
    startStr=`printf "%04d\n" $i`
    endStr=`printf "%04d\n" $end`
    mkdir 'leetcode_'$startStr'_'$endStr
    cd 'leetcode_'$startStr'_'$endStr

    for ((j=$i;j<=$end;j++)); do
        jStr=`printf "%04d\n" $j`
        mkdir 'leetcode_'$jStr
        cd 'leetcode_'$jStr

        printf 'package leetcode_'$startStr'_'$endStr'.leetcode_'$jStr';\n\n' > 'Solution'$jStr'Test.java'
        printf 'import org.junit.Test;\n\n' >> 'Solution'$jStr'Test.java'
        printf 'public class Solution'$jStr'Test {\n' >> 'Solution'$jStr'Test.java'
        printf '\tSolution'$jStr' solution'$jStr' = new Solution'$jStr'();\n\n' >> 'Solution'$jStr'Test.java'
        printf '\t@Test\n\tpublic void test1(){\n\n\t}\n}' >> 'Solution'$jStr'Test.java'
        cd ..
    done
    cd ..
done

