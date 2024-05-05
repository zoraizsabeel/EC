class ThirdLightBulb:
    @staticmethod
    def fibonacci(val):
        start = 0
        next_val = 1

        if val == 1:
            next_val = start
        elif val == 2:
            return next_val
        else:
            for i in range(2, val):
                temp = start + next_val
                start = next_val
                next_val = temp

        return next_val

    @staticmethod
    def main():
        holder = ThirdLightBulb.fibonacci(3)
        print(holder)

ThirdLightBulb.main()
