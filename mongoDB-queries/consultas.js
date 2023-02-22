//1
db.restaurants.find({})
//2
db.restaurants.find({}, {restaurant_id:1, name:1, borough:1, cuisine:1})
//3
db.restaurants.find({}, {restaurant_id:1, name:1, borough:1, cuisine:1, _id:0})
//4
db.restaurants.find({}, {restaurant_id:1, name:1, borough:1, "address.zipcode":1, _id:0})
//5
db.restaurants.find({"borough": "Bronx"})
//6
db.restaurants.find({"borough": "Bronx"}).limit(5)
//7
db.restaurants.find({"borough": "Bronx"}).skip(5).limit(5)
//8 revisar
db.restaurants.find({"grades.score": {$gt: 90}})
//9 revisar
db.restaurants.find({"grades.score": {$lt: 100,$gt: 80}})
//10 
db.restaurants.find({"address.coord.1": {$lt: -95.754168}})
//11
db.restaurants.find({ $and: [{"address.coord.1": {$lt: -65.754168}}, {"grades.score": {$lt: 100, $gt: 70}},{"cuisine": {"$not": /american/i}}]})
//12
db.restaurants.find({"address.coord.0": { $lt: -65.754168 }, "grades.score": { $gt: 70, $lt: 100 }, cuisine: {"$not": /american/i}})
//13
db.restaurants.find({ $and: [{"borough":{"$not": /brooklyn/i}}, {"grades.grade": "A"},{"cuisine": {"$not": /american/i}}]})
//14
db.restaurants.find({"name":{ "$regex": /^Wil/ } }, {restaurant_id:1, name:1, borough:1, cuisine:1})
//15
db.restaurants.find({"name":{ "$regex": /ces$/ } }, {restaurant_id:1, name:1, borough:1, cuisine:1})
//16
db.restaurants.find({"name":{ "$regex": /Reg/ } }, {restaurant_id:1, name:1, borough:1, cuisine:1})
//17
db.restaurants.find({ $and: [{"borough": "Bronx"}, {"cuisine": {$in: [/american/i, /chinese/i]}}]})
//18
db.restaurants.find({"borough": {$in: ["Staten Island", "Queens",  "Bronx", "Brooklyn"]}}, {restaurant_id:1, name:1, borough:1, cuisine:1})
//19
db.restaurants.find({"borough": {"$nin": ["Staten Island", "Queens",  "Bronx", "Brooklyn"]}}, {restaurant_id:1, name:1, borough:1, cuisine:1})
//20
db.restaurants.find({"grades.score": {$lte: 10}}, {restaurant_id:1, name:1, borough:1, cuisine:1})
//21
db.restaurants.find({$or: [{ name: { $regex: /^Wil/i  } },{cuisine: "Seafood", $and: [{ cuisine: { $not: { $regex: "chinese" } } },{ cuisine: { $not: { $regex: "american" } } } ]}]}, { restaurant_id: 1, name: 1, borough: 1, cuisine: 1 })
//22
db.restaurants.find({"grades.grade": "A","grades.score": 11,"grades.date": ISODate("2014-08-11T00:00:00Z")},{ "restaurant_id": 1, "name": 1, "grades": 1 })
//23
db.restaurants.find({"grades.2": {$elemMatch: {grade: "A",score: 9, date: ISODate("2014-08-11T00:00:00Z")}}},{restaurant_id: 1,name: 1, grades: 1, _id: 0});
//24
db.restaurants.find({"address.coord.1": {$gt: 42, $lte: 52}},{restaurant_id: 1,name: 1,"address.coord": 1,"address.street":1,_id: 0});
//25
db.restaurants.find().sort({name: 1})
//26
db.restaurants.find().sort({name: -1})
//27
db.restaurants.find().sort({"cuisine": 1, "borough": -1})
//28
db.restaurants.find({$or: [{ "address.street": { $exists: false }},{ "address.street": { $size: 0 }}]})
//29
db.restaurants.find({"address.coord": {$type: "double"}})
//30
db.restaurants.find({"grades.score" :{$mod : [7,0]}},{"restaurant_id" : 1,"name":1,"grades":1});
//31
db.restaurants.find({"name":{ "$regex": /mon/i } }, {name: 1,borough: 1,"address.coord": 1, cuisine: 1, _id: 0})
//32
db.restaurants.find({"name":{ "$regex": /^Mad/i } }, {name: 1,borough: 1,"address.coord": 1, cuisine: 1, _id: 0})


