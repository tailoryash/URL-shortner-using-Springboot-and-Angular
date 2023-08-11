import { Component } from '@angular/core';
import { UrlShortnerService } from 'src/app/shared/url-shortner.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent{

  url:string = "";
  isUrlGenerated : boolean = false;
  originalUrl : string = "";
  shortUrl : string  = "";
  isErrorGenerated: boolean = false;
  constructor(private urlShortnerService : UrlShortnerService){

  }
  ngOnInit() : void{
  this.isUrlGenerated= false;
  }

  generateShortUrl(){
      this.urlShortnerService.getShortUrl(this.url).subscribe(res=>{
        if(res == null){
          this.isErrorGenerated=true;
        }else{
          this.isUrlGenerated=true;
          this.shortUrl = res.shorturl;
          this.originalUrl = res.originalurl;
        }

      }, err=>{
          this.isUrlGenerated=false;
          this.isErrorGenerated = true;
      })


      this.isUrlGenerated = false;
  this.isErrorGenerated = false;
  }

}
