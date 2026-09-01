class hardware{
    public:
    int Statusreg;
    int Controlreg;
    int dataReg ;
};
int main (){
    int b = 10;
    hardware h;
    const int *regptr1 = &h.Statusreg;
    int * const regptr2 = &h.Controlreg;
    const int *const regptr3 = &h.dataReg;
    *regptr1 = 2; // error: assignment of read-only location '* regptr1'
    *regptr2 = 3;
    regptr2 = &b; //error: assignment of read-only variable 'regptr2'


    *regptr3 = h.Statusreg; //error: assignment of read-only location '*(const int*)regptr3'
    regptr3 = &h.Statusreg;// error: assignment of read-only variable 'regptr3'

}