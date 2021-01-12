#!/usr/bin/bash

echo "hello world"

# variable
echo ""; echo "#variation"

s="hello"

echo $s		# hello
echo "$s"	# hello
echo "${s}"	# hello
echo $s$s	# hellohello
echo "$s$s" # hellohello
echo '$s'	# $s

readonly FILE_NAME="hello.sh"
FILE_NAME="hello2.sh"


# operation
echo ""; echo "#operation"

x=10
echo $x		# 10
echo $x+2	# 10+2
echo `expr $x+2`	# 10+2
echo `expr $x + 2`	# 12
echo `expr $x - 2`	# 8
echo `expr $x / 2`	# 5
echo `expr $x \* 2`	# 20
echo `expr \( $x + 5 \) \* 2`	# 30


# array
echo ""; echo "#array"

a=(2 4 6)

echo $a			# 2
echo $a[1]		# 2[1] -> $a + "[1]"
echo ${a[1]}	# 4
echo ${a[@]}	# 2 4 6
echo ${#a[@]}	# 3 -> the number of elements

a[2]=10
echo ${a[@]}	# 2 4 10

a+=(20 30)
echo ${a[@]}	# 2 4 10 20	30

date			# Wed Jan 13 00:09:46     2021
d=(`date`)
echo ${d[3]}	# 00:09:46



# condition
echo ""; echo "#condition"

# exit 1 = false
# exit 0 = true
test 1 -eq 2; echo $?	# 1 -> exit code
test 1 -ne 2; echo $?	# 0 -> exit code

# -eq : equal
# -ne : not equal
# -gt : greater than 
# -ge : greater or equal
# -lt : less than
# -le : less or equal

# text
# =
# !=

# file
# -nt : newer than 
# -ot : older than
# -e : exists
# -d : directory or not

test -e hello.sh; echo $?	# 0

# logical operator
# -a : and
# -o : or
# ! : not
test 1 -eq 1 -a 2 -eq 2; echo $?	# 0



# if statement
echo ""; echo "#if statement"

x=70
if test $x -gt 60
then
	echo "ok!"
fi

x=60
if [ $x -gt 60 ]; then
	echo "ok!"
elif [ $x -gt 40 ]; then
	echo "soso.."
else
	echo "what the.."
fi


# case statement
echo ""; echo "#case statement"

signal="green"
case $signal in 
	"red")
		echo "stop!"
		;;
	"blue"|"green")
		echo "go!"
		;;
	"yellow")
		echo "caution!"
		;;
	*)
		echo "..."
		;;
esac

# while statement
echo ""; echo "#while statement"

i=0
while [ $i -lt 10 ]
do
	i=`expr $i + 1`
	
	if [ $i -eq 3 ]; then
		echo ""
		continue
	fi
	
	if [ $i -ge 10 ]; then
		echo ""
		break
	fi
	
	echo $i
done


# for statement
echo ""; echo "#for statement"

for i in 1 2 3 4 5
do
	echo $i
done

echo ""

a=(1 2 3 4 5)
for i in ${a[@]}
do
	echo $i
done

echo ""

for i in `seq 1 5`
do
	echo $i
done


# parameter
echo ""; echo "#parameter"

echo $0
echo $1
echo $2
echo ${10}

echo $@		# print all the parameters
echo $#		# the number of the parameter


# read
echo ""; echo "#read"

while :
do
	read key
	echo "you pressed $key"
	if [ $key = "end" ]; then
		break
	fi
done


# select
echo ""; echo "#select"
select option in CODE DIE
do
	echo "you pressed $option"
	break
done

# function
echo ""; echo "#function"

function hello() {
	echo "hello!"
}
hello

hello2() {
	local name1=$1
	name2=$2
	if [ $# -eq 1 ]; then
		echo "hello, $name1"
	elif [ $# -eq 2 ]; then
		echo "hello, $name1 and $name2"
	fi
}
hello2 simon
hello2 simon sonya

echo hello, $name1
echo hello, $name2