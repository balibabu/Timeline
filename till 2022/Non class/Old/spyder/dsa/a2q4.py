class person:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def display(self):
        print('NAME: ',self.name)
        print('AGE: ',self.age)
class student(person):
    def __init__(self,name,age,course,roll,marks):
        super().__init__(name,age)
        self.course=course
        self.roll=roll
        self.marks=marks
    def display(self):
        print('STUDENT DETAIL\n')
        super().display()
        print('COURSE: ',self.course)
        print('ROLL_NO.: ',self.roll)
        print('MARKS: ',self.marks)
class teacher(person):
    def __init__(self,name,age,sub_ass,contact_hr):
        super().__init__(name,age)
        self.sub_ass=sub_ass
        self.contact_hr=contact_hr
    def display(self):
        print('TEACHER DETAIL\n')
        super().display()
        print('SUBJECT_ASSIGNED: ',self.sub_ass)
        print('CONTACT_HOURS: ',self.contact_hr)

person1=student('bali',21,'cse',60,90)
person2=teacher('narmada',40,'calculus',6)
person1.display()
print('------------------------------------')
person2.display()

        