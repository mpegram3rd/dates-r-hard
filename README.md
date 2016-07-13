# dates-r-hard
Simple Spring Boot REST services demo for date/timestamp input/output handling because all good developers know "Dates are Hard!"

## Explanation
Spring REST + Jackson supports multiple formats for date/timestamps.  The two most natural ways to interact are either
as a "long" in milliseconds since the epoch (Jan 1, 1970 @ midnight GMT) or in a GMT formatted string like this:
"2016-06-30T04:00:00.000Z"

## What this does
This app very simply creates an endpoint at http://locahost:8080/timing that you can post a payload to.  It will return
a modified version of that payload adding 1 day to the date/times submitted.

To illustrate the point of how Jackson can handle multiple formats, here's a perfectly valid payload:

```javascript
{
   "start" : "2016-06-30T04:00:00.000Z",
   "stop" : 1234567890123
}
```