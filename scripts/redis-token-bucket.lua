local key = KEYS[1]
local capacity = tonumber(ARGV[1])
local requested = tonumber(ARGV[2])
local current = tonumber(redis.call('GET', key) or capacity)
if current >= requested then
 redis.call('DECRBY', key, requested)
 return 1
end
return 0
