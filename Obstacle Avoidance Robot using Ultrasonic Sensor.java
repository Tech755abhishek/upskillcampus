const int in1=2 ;
const int in2=3 ;
const int in3=4 ;
const int int4=5 ;
const int Trig=12 ;
const int Echo=13 ;
const int EN1 =6 ;
void setup(){
pinMode(in1 ,OUTPUT);
pinMode(in2 ,OUTPUT);
pinMode(in3 ,OUTPUT);
pinMode(int4 ,OUTPUT);
pinMode(Tr ig, OUTPUT);
pinMode(Echo, INPUT);
pinMode(EN1 , OUTPUT);
Serial.begin(9600); }
voidloop(){
d igitalWrite(Trig,LOW);
delay(2);
digita lWr ite ( Tr i g, HIGH);
delay(10);
digitalWrite(Trig,LOW);
long duratio n=p ulseI n( Echo ,HIGH);
int distance= 0.034 * duration /2 ;
Serial.p rint ln (distance );
delay(1000);
if(dista nce<=60) {
digitalWrite ( in1, HIGH);
digitalWrite ( in2, LO W);
digitalWrite ( in3, LO W);
digitalWrite ( int4, LO W); }
else{
digitalWrite ( in1, HIGH);
digitalWrite ( in1, LO W);
digitalWrite ( in1, LO W);
digitalWrite ( in1, HIGH);
}
}
# End
