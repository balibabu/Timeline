class pycharm:
    def execute(self):
        print('compiling')
        print('running')
class myeditor:
    def execute(self):
        print('suggestion')
        print('auto complete')
        print('compiling')
        print('running')
    
class laptop:
    def code(self,ide):
        ide.execute()

ide=pycharm()
ide=myeditor()
obj=laptop()
obj.code(ide)
