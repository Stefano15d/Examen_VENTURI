#include <iostream>
using namespace std;
 
int main () 
{
 int horas;
 int adicional;
 int precio=6.0;
 int total;
 int a;
    
   

    cout << "Digite el numero de horas: "  ;
    cin>>horas;
    
    if( horas<=0){
    	cout<<"Numero no permitido. Intentenlo de nuevo";
	}
	
	else if(horas>4){
			a= precio+(horas-4)*2;
	
	 cout <<"Importe a pagar es : "<<a  ;
		

	}
	
	else{
	
			total = 6;
    	
     	cout << "Importe a pagar es : "<<total  ;
}

	 

    

    return 0;
}