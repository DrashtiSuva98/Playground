
class compound:
    def get(self):
        principle_amount = float(input())
        rate_of_interest= float(input())
        no_of_times_compounded= float(input())
        no_of_years= float(input())
        return principle_amount,rate_of_interest,no_of_times_compounded,no_of_years

class Interest(compound):
    def calc(self):
        tup=self.get()
        p =tup[0]
        r=tup[1]
        r1=r/100
        t=tup[2]
        n= tup[3]
        cal = p*((1+r1/t)**(n*t))
        print('Principle amount: {}'.format(p))
        print('No.Of times compounded: {}'.format(t))
        print('No.Of.Years: {}'.format(n))
        print('Rate of interest: {}'.format(r))
        print('Amount: {}'.format(float(cal)))
        print('Compound Interest is: {}'.format(float(cal-p)))
        
i =Interest()
i.calc()

        