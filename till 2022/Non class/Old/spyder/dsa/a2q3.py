class student:
    def input_student(self):
        self.roll_no=int(input('enter roll_no. '))
        self.name=input('enter your name ')
        self.course=input('which course ')
    def display_student(self):
        print('name: ',self.name)
        print('roll_no.: ',self.roll_no)
        print('course: ',self.course)

class exam(student):
    def input_mark(self):
        self.mark1=int(input('enter your mark in subject1 '))
        self.mark2=int(input('enter your mark in subject2 '))
        self.mark3=int(input('enter your mark in subject3 '))
    def display_result(self):
        print('your total marks is ',(self.mark1+self.mark2+self.mark3))
        print('')
        
arr=[]
for i in range(2):
    print('enter info of student no. ',i)
    arr.append(exam())
    arr.append(exam())
for i in range(2):
    arr[i].input_student()
    arr[i].input_mark()
print('\n====================================================')   
print('printing the recorded data')
print('====================================================')   

for i in range(2):
    arr[i].display_student()
    arr[i].display_result()
print('thanks for using it')
        