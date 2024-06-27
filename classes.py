class Sem3:

    def __init__(self, subjects, class_rep, teachers):
        self.subjects = subjects
        self.class_rep = class_rep
        self.teachers = teachers
        self.attendance = 0

    def update_attendance(self, hours):
        self.attendance += hours
        print(f"Attendance updated. Total hours: {self.attendance}")

    def display_details(self):
        print("Third Semester Details:")
        print(f"Subjects: {', '.join(self.subjects)}")
        print(f"Class Representative: {self.class_rep}")
        print("Teachers:")
        for teacher in self.teachers:
            print(f"- {teacher}")
        print(f"Total Attendance: {self.attendance} hours")

subjects = ["Data Mining", "Python", "Finance", "Android"]
class_rep = "Chemban"
teachers = ["DKB", "DR Sunu Fathima", "Dr Bindiya"]

sem3 = Sem3(subjects, class_rep, teachers)
sem3.update_attendance(60)
sem3.display_details()