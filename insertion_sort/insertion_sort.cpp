//insertion sort
#include <iostream>

void insertion_sort(){
    int A[10] = {10,9,8,7,6,5,4,3,2,1};
	std::cout<<"A ";
	for (int j = 0; j<10; j++){
	    std::cout<< A[j]<<" ";		
	}

    for (int i=0; i<10; i++){
        int temp = i;
        while (temp > 0 and A[temp-1]>A[temp]){
            int temp_b = A[temp];
            A[temp] = A[temp-1];
            A[temp-1] = temp_b;
            temp = temp - 1;
        }
    }
	std::cout<< '\n' <<"A ";
	for (int k = 0; k<10; k++){
	    std::cout<< A[k] <<" ";		
	}
	std::cout<<std::endl;
}


int main(){
    insertion_sort();
    return 0;
}