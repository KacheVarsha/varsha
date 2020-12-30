#!/bin/bash -x
echo "Welcome to Employee Wage Computation Program on Test Branch"
var=$((RANDOM%2))
if [ $var -eq 1 ]
then
	echo "Employee is Present"
else
	echo "Employee is Absent"
fi
daily_wage=8*20
echo $daily_wage
echo "enter 1. fulltime and 2. part time"
read choice
case $choice in
1) echo "fulltime Employee"
      wage=20*8*$month ;;
2) echo "Parttime"
      wage=20*8*8 ;;
*) echo "enter correct choice" ;;
esac
month=1
hour=1
while[ $month -eq 20 -a $hour -eq 100 ]
do
	total_working_hour=$month*$hour
	((month++))
	((hour++))
done


