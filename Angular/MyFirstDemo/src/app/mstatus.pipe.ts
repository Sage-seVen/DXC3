import { PipeTransform, Pipe } from '@angular/core';

@Pipe({name:"mstatu"})
export class mstatus implements PipeTransform
{
    transform(value: string, gender:string , marital:string) {
        if(gender.toUpperCase()=="MALE")
        {
            return "MR "+value;
        }
        else if(gender.toUpperCase()=="FEMALE"&& marital.toUpperCase()=="MARRIED")
        {
            return "MRS."+value;
        }
        else
        {
            return "MISS "+value;
        }
    }

}