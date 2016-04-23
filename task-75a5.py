import urllib2

req = urllib2.Request('http://www.qlcoder.com/train/proxy')

req.set_proxy('121.201.63.168:8080', 'http')
res = urllib2.urlopen(req)
data = res.read()
print data
