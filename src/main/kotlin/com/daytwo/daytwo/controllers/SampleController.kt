package com.daytwo.daytwo.controllers

import com.daytwo.daytwo.models.SampleData
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//rest controller + list => export => JSON
@RestController
@RequestMapping("/api/sample")
class SampleController {
    @GetMapping("/hello")
    fun getHello(): String{
        return "Hello Spring Boot From Sample Controller!"
    }
    @GetMapping
    fun getSample(): List<SampleData>{
        return listOf(
            SampleData(1,"John","john@gmail.com","0895544587","Bangkok"),
            SampleData(2,"Jane","jane@gmail.com","0895544587","Nan"),
            SampleData(3,"Jim","jane@gmail.com","0895544587","Nan"),
        )
    }

    @GetMapping("/{id}")
//    รับ parameter ID จาก path
    fun getSampleById(@PathVariable id: Int): SampleData{
        return SampleData(id, "John", "john@gmail.com", "0895544587", "Bangkok")
    }

    @PostMapping
//    request body => รับค่าเข้าใน Functions
    fun createSample(@RequestBody sampleData: SampleData): SampleData{
        return sampleData
    }

    @PutMapping("/{id}")
    fun updateSample(@PathVariable id: Int, @RequestBody sampleData: SampleData): SampleData{
        return sampleData.copy(id = id)
    }

    @DeleteMapping("/{id}")
    fun deleteSample(@PathVariable id: Int): String{
        return "Sample Id $id has been deleted"
    }
}